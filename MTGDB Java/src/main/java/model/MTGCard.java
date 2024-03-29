package model;

public class MTGCard {

    private int mtgoID;

    private String name;

    private String  manaCost;

    private  String typeLine;

    private String oracleText;

    private String colors;

    private String colorIdentity;

    private int power;

    private int toughness;

    private String keywords;

    private double prices;

    public MTGCard(int mtgoID, String name, String manaCost, String typeLine, String oracleText, String colors, String colorIdentity, int power, int toughness, String keywords, double prices) {
        this.mtgoID = mtgoID;
        this.name = name;
        this.manaCost = manaCost;
        this.typeLine = typeLine;
        this.oracleText = oracleText;
        this.colors = colors;
        this.colorIdentity = colorIdentity;
        this.power = power;
        this.toughness = toughness;
        this.keywords = keywords;
        this.prices = prices;
    }

    public int getMtgoID() {
        return mtgoID;
    }

    public void setMtgoID(int mtgoID) {
        this.mtgoID = mtgoID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public String getTypeLine() {
        return typeLine;
    }

    public void setTypeLine(String typeLine) {
        this.typeLine = typeLine;
    }

    public String getOracleText() {
        return oracleText;
    }

    public void setOracleText(String oracleText) {
        this.oracleText = oracleText;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getColorIdentity() {
        return colorIdentity;
    }

    public void setColorIdentity(String colorIdentity) {
        this.colorIdentity = colorIdentity;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }
    
}
