package com.capgemini.packg;

public class Firstclass {
    public static class Box {
        private int side;
        private String color;

        public int getSide() {
            return side;
        }

        public String getColor() {
            return color;
        }

        public void setSide(int side) {
            this.side = side;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Box{" +
                    "side=" + side +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Box b = new Box();
        b.setSide(4);
        b.setColor("white");

        Box b1 = new Box();
        b1.setSide(6);
        b1.setColor("black");

        System.out.println(b.getColor());
        System.out.println(b.getSide());
        System.out.println(b1.getColor());
        System.out.println(b1.getSide());

        Box b2 = new Box();
        b2.setSide(10);
        b2.setColor("Purple");
        System.out.println(b2.getSide());
        System.out.println(b2.getColor());

        String s = "hello";
        String s1 = "hello";
        s = "hello1";
        System.out.println(s +" "+s1);


    }
}
