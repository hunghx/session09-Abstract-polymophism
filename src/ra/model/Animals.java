package ra.model;

public abstract class Animals {
    private String tenLoai;
    private byte gen;
    public abstract void makeSound();

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public byte getGen() {
        return gen;
    }

    public void setGen(byte gen) {
        this.gen = gen;
    }

    public Animals() {
    }

    public Animals(String tenLoai, byte gen) {
        this.tenLoai = tenLoai;
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "tenLoai='" + tenLoai + '\'' +
                ", gen=" + gen +
                '}';
    }

}
