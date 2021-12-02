package homework13;

import util.StringUtil;

import java.util.Scanner;

public class App {
    private static final String[] COMMANDS = {"length", "reverse", "upper", "lower", "change", "quit"};
    private final Scanner m_kb = new Scanner(System.in);
    private String m_prompt;

    private static String getCommandByText(String text) {
        if (text.length() < 3)
            return "";

        for (String cmdStr : COMMANDS)
            if (cmdStr.startsWith(text))
                return cmdStr;

        return "";
    }

    private static void lengthProc(String[] commandInfo) {
        if (commandInfo.length != 2) {
            System.out.println("length bir tane argüman almalıdır");
            return;
        }
        System.out.println(commandInfo[1].length());
    }

    private static void reserveProc(String[] commandInfo) {
        if (commandInfo.length != 2) {
            System.out.println("reverse bir tane argüman almalıdır");
            return;
        }
        System.out.println(commandInfo[1].toUpperCase());
    }

    private static void upperProc(String[] commandInfo) {
        if (commandInfo.length != 2) {
            System.out.println("upper bir tane argüman almalıdır");
            return;
        }

        System.out.println(commandInfo[1].toUpperCase());
    }

    private static void lowerProc(String[] commandInfo) {
        if (commandInfo.length != 2) {
            System.out.println("lower bir tane argüman almalıdır");
            return;
        }
        System.out.println(commandInfo[1].toLowerCase());
    }

    private static void quitProc(String[] commandInfo) {
        System.out.println("görüşmek üzere iyi günler...");
        System.exit(0);
    }

    private void changeProc(String[] commandInfo) {
        m_prompt = StringUtil.join(commandInfo, 1, ' ');
    }

    private void doWorkForCommand(String[] commandInfo) {
        switch (commandInfo[0]) {
            case "length":
                lengthProc(commandInfo);
                break;
            case "reverse":
                reserveProc(commandInfo);
                break;
            case "upper":
                upperProc(commandInfo);
                break;
            case "lower":
                lowerProc(commandInfo);
                break;
            case "change":
                changeProc(commandInfo);
                break;
            default:
                quitProc(commandInfo);
                break;
        }
    }

    private void parseCommand(String[] commandsInfo) {
        String cmdStr = getCommandByText(commandsInfo[0]);

        if (!cmdStr.isEmpty()) {
            commandsInfo[0] = cmdStr;
            doWorkForCommand(commandsInfo);
        } else {
            System.out.println("Geçersiz komut");
        }
    }

    public void CommandPrompt(String prompt) {
        m_prompt = prompt;
    }

    public void run() {

        for (; ; ) {
            System.out.print(m_prompt + ">");
            String cmd = m_kb.nextLine().trim();
            parseCommand(cmd.split("[ \t]"));
        }
    }
}
