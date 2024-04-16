package calc;

import io.qameta.allure.Step;

public class CalcSteps {
@Step("Sum numbers {a} + {b}")
    public int sum(int a, int b) {
        return a + b;
    }

    public boolean isPositive(int res) {
    return res > 0;
    }
}
