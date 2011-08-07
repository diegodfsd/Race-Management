package racetrack

class RunnerController {
    def scaffold = Runner

    def index = {
        redirect(action: "list", params: params)
    }
}
