package hw6.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

public class MetalsAndColors {

    @JsonProperty("summary")
    protected String[] summary;
    @JsonProperty("elements")
    protected String[] elements;
    @JsonProperty("color")
    protected String color;
    @JsonProperty("metals")
    protected String metals;
    @JsonProperty("vegetables")
    protected String[] vegetables;

    private String radio_odd;
    private String radio_even;

    public MetalsAndColors() {
    }

    public MetalsAndColors(String[] elements, String color, String metals, String[] vegetables, String[] summary) {

        this.elements = elements;
        this.color = color;
        this.metals = metals;
        this.vegetables = vegetables;
        this.summary = summary;
    }

    public String[] getSummary() {
        return summary;
    }

    public void setSummary(String[] summary) {
        this.summary = summary;
    }

    public String[] getElements() {
        return elements;
    }

    public void setElements(String[] elements) {
        this.elements = elements;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMetals() {
        return metals;
    }

    public void setMetals(String metals) {
        this.metals = metals;
    }

    public String[] getVegetables() {
        return vegetables;
    }

    public void setVegetables(String[] vegetables) {
        this.vegetables = vegetables;
    }

    public String getRadio_odd() {
        return this.summary[0];
    }

    public void setRadio_odd(String radio_odd) {
        this.radio_odd = radio_odd;
    }

    public String getRadio_even() {
        return this.summary[1];
    }

    public void setRadio_even(String radio_even) {
        this.radio_even = radio_even;
    }

    @Override
    public String toString() {
        return "MetalsAndColors{" +
                "summary=" + Arrays.toString(summary) +
                ", elements=" + Arrays.toString(elements) +
                ", color='" + color + '\'' +
                ", metals='" + metals + '\'' +
                ", vegetables=" + Arrays.toString(vegetables) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetalsAndColors that = (MetalsAndColors) o;
        return Arrays.equals(summary, that.summary)
                && Arrays.equals(elements, that.elements)
                && Objects.equals(color, that.color)
                && Objects.equals(metals, that.metals)
                && Arrays.equals(vegetables, that.vegetables);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(color, metals);
        result = 31 * result + Arrays.hashCode(summary);
        result = 31 * result + Arrays.hashCode(elements);
        result = 31 * result + Arrays.hashCode(vegetables);
        return result;
    }

    public List<String> convertedResults() {
        List<String> actualRows = new ArrayList<>();

        String expectedSum =
                String.valueOf(Integer.parseInt(this.summary[0]) + Integer.parseInt(this.summary[1]));
        actualRows.add("Summary: " + expectedSum);

        if (this.elements.length == 2) {
            actualRows.add("Elements: " + this.elements[0] + ", " + this.elements[1]);
        } else if (this.elements.length == 4) {
            actualRows.add("Elements: " + this.elements[0]
                    + ", " + this.elements[1] + ", " + this.elements[2] + ", " + this.elements[3]);
        }

        actualRows.add("Color: " + this.color);

        actualRows.add("Metal: " + this.metals);


        String veg = "Vegetables: ";
        for (int i = 0; i < this.vegetables.length - 1; i++) {
            veg += this.vegetables[i] + ", ";
        }
        veg += this.vegetables[this.vegetables.length - 1];
        actualRows.add(veg);

        return actualRows;
    }
}
