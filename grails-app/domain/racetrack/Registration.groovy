package racetrack

class Registration {
    String name
    Date dateOfBirth
    String gender
    String address
    String city
    String state
    String zipCode
    String email
    Date dateCreated

    static belongsTo = [race: Race]

    static constraints = {
    }
}
