import racetrack.Runner
import grails.util.GrailsUtil
import racetrack.Race
import racetrack.Registration
import racetrack.User

class BootStrap {

    /*
    * Esse metodo é chamado toda vez que o Grils starta
    * Aqui é um ótimo lugar para inserir dados fake no meu DB
    * */
    def init = { servletContext ->
        if(GrailsUtil.environment == "development"){
            def hamilton = new Runner(
                    firstName: "Lewis",
                    lastName: "Hammilton",
                    dateOfBirth: (new Date() - 365 * 26),
                    gender: "M",
                    address: "123 Main Street",
                    city: "São Paulo",
                    state: "SP",
                    zipCode: "00000000",
                    email: "lewis.hamilton@f1.com"
            )
            hamilton.save()

            if(hamilton.hasErrors())
                println hamilton.errors

            def interlagos = new Race(
                name: "F1 Interlagos",
                startDate: new Date(year: 2011, month: 11, date: 15),
                city: "São Paulo",
                state: "SP",
                cost: 100,
                distance: 4500.00,
                maxRunners: 20
            )

            interlagos.save()

            if(interlagos.hasErrors())
                println interlagos.errors

            def registro = new Registration(
                    race: interlagos,
                    runner: hamilton,
                    paid:false)

            registro.save()

            if(registro.hasErrors())
                println registro.errors

            def admin = new User(login:"admin",
                                 password: "wordpass",
                                 role: "admin")
            admin.save()

            if(admin.hasErrors())
                println admin.errors

            def charle = new User(login: "Charle",
                                  password: "password",
                                  role: "user")
            charle.save()

            if(charle.hasErrors())
                println charle.errors
        }
    }
    def destroy = {
    }
}
