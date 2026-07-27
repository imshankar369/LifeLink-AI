package util;

import java.time.LocalDateTime;

public class Logger {

    public static void info(String message) {

        System.out.println(
                "[INFO] "
                        + LocalDateTime.now()
                        + " : "
                        + message
        );

    }

}
