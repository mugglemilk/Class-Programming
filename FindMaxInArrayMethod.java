
class SimpleMath {

    double findMaxInArray(double[] precision) {
        double max = -Double.MAX_VALUE;
        for (int i = 0; i < precision.length; ++i) {
            if (precision[i] > max) {
                max = precision[i];
            }
        }
        return max;
    }
}
