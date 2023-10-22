package baseball;

import java.util.List;
import java.util.Map;

public class MenuHandler {
    private final Computer computer;
    private final Communicator communicator;

    public MenuHandler(Computer computer, Communicator communicator) {
        this.computer = computer;
        this.communicator = communicator;
        initialHandle();
    }

    private void initialHandle() {
        communicator.printStart();
        computer.decideAnswer();

        List<Integer> inputNumbers = communicator.instructInputNumbers();
        Map<String, Integer> counts = computer.count(inputNumbers);
        communicator.printResult(counts);
    }
}
