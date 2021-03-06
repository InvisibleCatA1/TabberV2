package Client.command;

import Client.utils.ConsoleColor;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class NoOP extends Command {
    public NoOP() {
        super("NoOP", "Called when there is an invalid command", "N/A");
    }

    @Override
    public void run(ArrayList<String> args, BufferedReader receive, PrintWriter send) {
        send.println(ConsoleColor.ANSI_RED + "This is an unknown command" + ConsoleColor.ANSI_RESET);
    }
}
