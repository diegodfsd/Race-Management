package racetrack

import grails.test.GrailsUnitTestCase


class RaceTests extends GrailsUnitTestCase{

    void testInMiles() {
        def race = new Race(distance:5.0)
        assertEquals 3.107, race.inMiles()
    }
}
