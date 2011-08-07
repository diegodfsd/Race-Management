package racetrack

class RegistrationController {
    def scaffold = Registration

    def index = {
        redirect(action: "list", params: params)
    }
}
