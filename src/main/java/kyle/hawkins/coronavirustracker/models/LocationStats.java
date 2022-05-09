package kyle.hawkins.coronavirustracker.models;

public class LocationStats {

    private String state;
    private String country;

    public String getLatestTotalCasesString() {
        return String.format("%,d",latestTotalCases);
    }

    public void setLatestTotalCasesString(String latestTotalCasesString) {
        this.latestTotalCasesString = latestTotalCasesString;
    }

    public String getDiffFromPrevDayString() {
        return String.format("%,d",diffFromPrevDay);
    }

    public void setDiffFromPrevDayString(String diffFromPrevDayString) {
        this.diffFromPrevDayString = diffFromPrevDayString;
    }

    private String latestTotalCasesString;
    private String diffFromPrevDayString;

    private int diffFromPrevDay;
    private int latestTotalCases;


    public int getDiffFromPrevDay() {
        return diffFromPrevDay;
    }

    public void setDiffFromPrevDay(int diffFromPrevDay) {
        this.diffFromPrevDay = diffFromPrevDay;
    }



    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
