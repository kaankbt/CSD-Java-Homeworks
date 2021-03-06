package homework2._05;

import java.util.Scanner;

public class SnakeDesignApp_ {
    public static void main(String[] args) {
        BallFallGameApp.run();
    }
}

class BallFallGameApp {
    public static void run() {
        Scanner kb = new Scanner(System.in);

        BallFall ballFall = new BallFall();
        for (; ; ) {
            System.out.print("Width değerini giriniz:");
            int width = Integer.parseInt(kb.nextLine());

            if (width <= 0)
                break;

            System.out.print("Height değerini giriniz:");
            int height = Integer.parseInt(kb.nextLine());

            ballFall.play(width, height);
            String shape = ballFall.getShape();

            System.out.println(shape);
        }
    }

    public static class BallFall {
        private String m_shape;

        private static boolean updateRightFlag(int ballIndex, boolean isRight, int width) {
            if (ballIndex == 0)
                isRight = true;
            else if (ballIndex == width - 1)
                isRight = false;

            return isRight;
        }

        private static int updateBallIndex(boolean isRight, int ballIndex) {
            if (isRight)
                ++ballIndex;
            else
                --ballIndex;

            return ballIndex;
        }

        private void fillSpace(int begin, int end) {
            for (int i = begin; i < end; ++i)
                m_shape += ' ';
        }

        private void fillBall(int ballIndex, int end) {
            fillSpace(0, ballIndex);
            m_shape += '*';
            fillSpace(ballIndex + 1, end);
        }

        public BallFall() {
            m_shape = "";
        }

        public String getShape() {
            return m_shape;
        }

        public void play(int width, int height) {
            int ballIndex = 0;
            boolean isRight = true;

            m_shape = "";
            for (int i = 1; i <= height; ++i) {
                m_shape += '|';
                fillBall(ballIndex, width);
                isRight = updateRightFlag(ballIndex, isRight, width);
                if (width != 1)
                    ballIndex = updateBallIndex(isRight, ballIndex);
                m_shape += "|\r\n";
            }
        }
    }
}