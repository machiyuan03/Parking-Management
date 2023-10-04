package CarBooking.Model;

public class Spot {
    private Integer id;
    private String location;
    private Double priceRatePH;
    private Double priceRatePD;
    private Double priceRateON;
    private Integer sSpot;
    private Integer mSpot;
    private Integer lSpot;
    private Integer passAvailable;
    private Integer discountAvailable;

    public Spot(Integer id, String location, Double priceRatePH, Double priceRatePD, Double priceRateON, Integer sSpot, Integer mSpot, Integer lSpot, Integer passAvailable, Integer discountAvailable) {
        this.id = id;
        this.location = location;
        this.priceRatePH = priceRatePH;
        this.priceRatePD = priceRatePD;
        this.priceRateON = priceRateON;
        this.sSpot = sSpot;
        this.mSpot = mSpot;
        this.lSpot = lSpot;
        this.passAvailable = passAvailable;
        this.discountAvailable = discountAvailable;
    }

    public Spot(String location, Double priceRatePH, Double priceRatePD, Double priceRateON, Integer sSpot, Integer mSpot, Integer lSpot, Integer passAvailable, Integer discountAvailable) {
        this.location = location;
        this.priceRatePH = priceRatePH;
        this.priceRatePD = priceRatePD;
        this.priceRateON = priceRateON;
        this.sSpot = sSpot;
        this.mSpot = mSpot;
        this.lSpot = lSpot;
        this.passAvailable = passAvailable;
        this.discountAvailable = discountAvailable;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getPriceRatePH() {
        return priceRatePH;
    }

    public void setPriceRatePH(Double priceRatePH) {
        this.priceRatePH = priceRatePH;
    }

    public Double getPriceRatePD() {
        return priceRatePD;
    }

    public void setPriceRatePD(Double priceRatePD) {
        this.priceRatePD = priceRatePD;
    }

    public Double getPriceRateON() {
        return priceRateON;
    }

    public void setPriceRateON(Double priceRateON) {
        this.priceRateON = priceRateON;
    }

    public Integer getsSpot() {
        return sSpot;
    }

    public void setsSpot(Integer sSpot) {
        this.sSpot = sSpot;
    }

    public Integer getmSpot() {
        return mSpot;
    }

    public void setmSpot(Integer mSpot) {
        this.mSpot = mSpot;
    }

    public Integer getlSpot() {
        return lSpot;
    }

    public void setlSpot(Integer lSpot) {
        this.lSpot = lSpot;
    }

    public Integer getPassAvailable() {
        return passAvailable;
    }

    public void setPassAvailable(Integer passAvailable) {
        this.passAvailable = passAvailable;
    }

    public Integer getDiscountAvailable() {
        return discountAvailable;
    }

    public void setDiscountAvailable(Integer discountAvailable) {
        this.discountAvailable = discountAvailable;
    }


}
