package com.wyc.d1_set;

public class Apple implements Comparable<Apple> {
    private String name;
    private double price;
    private int weight;

    public Apple() {
    }

    public Apple(String name, double price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    /**
     * 类自定义比较规则
     * o1.compareTo(o2)
     * @param o
     * @return
     */
    @Override
    public int compareTo(Apple o) {
        // 不去掉重量重复元素
        return this.weight - o.weight >= 0 ? 1 : -1;
    }
}
