package racetrack

class UserController {

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {
        params.max = Math.min(params.max?
                                params.int('max') : 10, 100)
        [userInstanceList: User.list(params),
         userInstanceTotal: User.count()]
    }

    def show = {
        def user = User.get(params.id)
            if(!user){
                flash.message="""${message(code:'default.not.found.message',
                                         args: [message(code: 'user.label',
                                                        default: 'User'), params.id])}"""
                redirect(action: "list")
            }else{
              [userInstance: user]
            }
    }

    def login ={}

    def logout = {
        flash.message = "Goodbye ${session.user.login}"
        session.removeValue("user")
        redirect(action: "login")
    }

    def authenticate = {
        def user = User.findByLoginAndPassword(params.login,
                                               params.password)


        if(user){
            session.user = user
            flash.message = "Hello ${user.login}!"
            redirect(controller: "race", action: "list")
        }else{
            flash.message =
                "Sorry, ${params.login}. Please try again."
            redirect(action: "login")
        }
    }
}
