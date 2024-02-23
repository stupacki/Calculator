package viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual abstract class CalculatorViewModel actual constructor() : ViewModel() {

    actual val scope: CoroutineScope
        get() = viewModelScope

    protected actual override fun onCleared() {
        super.onCleared()
    }
}
