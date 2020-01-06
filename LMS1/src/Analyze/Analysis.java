
package Analyze;

import Employer.Collector;

public class Analysis {
    private int countActiveLoans;
    private int countCompletedLoans;
    private int countAbondenedLoans;
    private float totalLoans;
    private float totalCollections;
    private float totalOverpays;
    private float totalAbondened;
    private float totalArrears;
    private float totalToCollect;

    public int getCountActiveLoans() {
        return countActiveLoans;
    }

    public void setCountActiveLoans(int countActiveLoans) {
        this.countActiveLoans = countActiveLoans;
    }

    public int getCountCompletedLoans() {
        return countCompletedLoans;
    }

    public void setCountCompletedLoans(int countCompletedLoans) {
        this.countCompletedLoans = countCompletedLoans;
    }

    public int getCountAbondenedLoans() {
        return countAbondenedLoans;
    }

    public void setCountAbondenedLoans(int countAbondenedLoans) {
        this.countAbondenedLoans = countAbondenedLoans;
    }

    public float getTotalLoans() {
        return totalLoans;
    }

    public void setTotalLoans(float totalLoans) {
        this.totalLoans = totalLoans;
    }

    public float getTotalCollections() {
        return totalCollections;
    }

    public void setTotalCollections(float totalCollections) {
        this.totalCollections = totalCollections;
    }

    public float getTotalOverpays() {
        return totalOverpays;
    }

    public void setTotalOverpays(float totalOverpays) {
        this.totalOverpays = totalOverpays;
    }

    public float getTotalAbondened() {
        return totalAbondened;
    }

    public void setTotalAbondened(float totalAbondened) {
        this.totalAbondened = totalAbondened;
    }

    public float getTotalArrears() {
        return totalArrears;
    }

    public void setTotalArrears(float totalArrears) {
        this.totalArrears = totalArrears;
    }

    public float getTotalToCollect() {
        return totalToCollect;
    }

    public void setTotalToCollect(float totalToCollect) {
        this.totalToCollect = totalToCollect;
    }
}
