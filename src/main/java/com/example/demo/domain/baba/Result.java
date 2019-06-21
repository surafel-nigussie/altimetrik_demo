package com.example.demo.domain.baba;

public class Result {
    private Message message;
    private Body body;

    public static class Message {
        public static class Header {
            private int status_code;
            private double execute_time;
            private int confidence;
            private String mode;
            private int cached;
        }
    }

    public static class Body {
        private Track track;
    }
}
