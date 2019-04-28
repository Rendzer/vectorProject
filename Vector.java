package vector;

import java.util.ArrayList;
import java.util.List;

class Vector {
    List<Integer> valueList;

    Vector() {
        valueList = new ArrayList<>();
    }

    void checkVectorLength(Vector secondVector) throws WektoryRoznejDlugosciException {
        if (this.valueList.size() != secondVector.valueList.size()) {
            throw new WektoryRoznejDlugosciException(this.valueList.size(), secondVector.valueList.size());
        }
    }

}