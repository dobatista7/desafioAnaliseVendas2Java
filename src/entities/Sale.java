package entities;

public class Sale {
    private Integer month;
    private Integer year;
    private String seller;
    private Integer items;
    private Double total;

    public Sale(Integer month, Integer year, String seller, Integer items, Double total) {
        this.month = month;
        this.year = year;
        this.seller = seller;
        this.items = items;
        this.total = total;
    }


    public Integer getMonth() {
        return month;
    }

    public Integer getYear() {
        return year;
    }

    public String getSeller() {
        return seller;
    }

    public Integer getItems() {
        return items;
    }

    public Double getTotal() {
        return total;
    }

    // Método para calcular o preço médio por item
    public Double averagePrice() {
        if (items == 0) {
            return 0.0;
        }
        return total / items;
    }


    @Override
    public String toString() {
        return "Sale{" +
                "month=" + month +
                ", year=" + year +
                ", seller='" + seller + '\'' +
                ", items=" + items +
                ", total=" + total +
                ", averagePrice=" + averagePrice() +
                '}';
    }
}
