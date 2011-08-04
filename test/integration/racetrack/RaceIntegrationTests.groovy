package racetrack

class RaceIntegrationTests extends GroovyTestCase {
    void testRaceDatesBeforeDay(){
        def lastWeek = new Date() -7
        def race = new Race(startDate: lastWeek)

        assertFalse "Validation should not succeed", race.validate()
        assertTrue "There should be errors", race.hasErrors()
    }
}
