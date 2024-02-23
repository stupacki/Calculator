package viewmodel

import kotlinx.coroutines.CoroutineScope

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
expect abstract class CalculatorViewModel() {

    val scope: CoroutineScope

    protected open fun onCleared()
}