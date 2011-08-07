package racetrack

class Runner {
    String firstName
    String lastName
    Date dateOfBirth
    String gender
    String address
    String city
    String state
    String zipCode
    String email

    static constraints = {
        firstName(blank: false)
        lastName(blank: false)
        dateOfBirth()
        gender(inList: ["F", "M"])
        address()
        city()
        state()
        zipCode()
        email(email:true)
    }

    static hasMany = [registrations: Registration]


    String toString(){
        "${lastName}, ${firstName} (${email})"
    }
}
