package viewmodel

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.cancel

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual abstract class CalculatorViewModel actual constructor() {

    actual val scope: CoroutineScope
        get() = MainScope()

    protected actual open fun onCleared() {}

    fun clear() {
        onCleared()
        scope.cancel()
    }
}