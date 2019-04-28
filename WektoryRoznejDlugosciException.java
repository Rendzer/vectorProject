package vector;

class WektoryRoznejDlugosciException extends Exception {

    int firstVectorLength;
    int secondVectorLength;

    public WektoryRoznejDlugosciException(int firstVectorLength, int secondVectorLength) {
        this.firstVectorLength = firstVectorLength;
        this.secondVectorLength = secondVectorLength;
    }

    public int getFirstVectorLength() {
        return firstVectorLength;
    }

    public int getSecondVectorLength() {
        return secondVectorLength;
    }
}