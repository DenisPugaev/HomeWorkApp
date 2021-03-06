package ru.geekbrains.lesson8;
//Created by: Denis

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
Homework
for
lesson 8

Задача:
Разобрать код и доработать проект.

Дороботка: Яд не накапливается на игровом поле, а изчезает и появляется в другом месте.

Небольшие измененения:
 -поменял отрисовку змейки с овальной на "классическую квадратную";
 -изменил скорость движения змейки;
 - и другие незначимые изменения(менял настройки и смотрел что будет, что положительное оставлял);


 */
public class GameSnake extends JFrame {
    final String TITLE_OF_PROGRAM = "Classic Game Snake";
    final String GAME_OVER_MSG = "Игра окончена!";
    final static int CELL_SIZE = 25;           // Размер поля
    final static int CANVAS_WIDTH = 30;        // Размер окна
    final static int CANVAS_HEIGHT = 25;       // Размер окна
    final static Color SNAKE_COLOR = Color.green;
    final static Color FOOD_COLOR = Color.darkGray;
    final static Color POISON_COLOR = Color.red;
    final static int KEY_LEFT = 37;            //  клавиши управление змейкой
    final static int KEY_UP = 38;
    final static int KEY_RIGHT = 39;
    final static int KEY_DOWN = 40;
    final int START_SNAKE_SIZE = 10;            // Начальный размер змейки
    final int START_SNAKE_X = CANVAS_WIDTH / 2;  //   Начальная позиция
    final int START_SNAKE_Y = CANVAS_HEIGHT / 2;
    final int SNAKE_DELAY = 120;               // Скорость змейки(чем больше число задержки! тем медленее змейка!)
    int snakeSize = 0;
    static boolean gameOver = false;         //   Проверка проигрыша


    Canvas canvas;
    Snake snake;
    Food food;
    Poison poison;

    public GameSnake() {
        setTitle(TITLE_OF_PROGRAM);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        canvas = new Canvas();
        canvas.setBackground(Color.lightGray);
        canvas.setPreferredSize(new Dimension(CELL_SIZE * CANVAS_WIDTH - 5,
                CELL_SIZE * CANVAS_HEIGHT - 5));

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                snake.setDirection(e.getKeyCode());
            }
        });

        add(canvas);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GameSnake().game();
    }

    private void game() {
        snake = new Snake(
                START_SNAKE_X,
                START_SNAKE_Y,
                START_SNAKE_SIZE,
                KEY_RIGHT
        );
        food = new Food(snake);
        snake.setFood(food);

        poison = new Poison(snake);
        poison.setFood(food);
        food.setPoison(poison);
        snake.setPoison(poison);

        while (!gameOver) {
            snake.move();

            if (snake.size() > snakeSize) {
                snakeSize = snake.size();
                setTitle(TITLE_OF_PROGRAM + ":" + snakeSize);
            }

            if (food.isEaten()) {
                food.appear();
                poison.add();
            }
            canvas.repaint();
            sleep(SNAKE_DELAY);
        }
        JOptionPane.showMessageDialog(this, GAME_OVER_MSG);
    }

    private void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    class Canvas extends JPanel {    // class for rendering (drawing)
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2D = (Graphics2D) g;
            g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            snake.paint(g2D);
            food.paint(g2D);
            poison.paint(g2D);
        }
    }
}
