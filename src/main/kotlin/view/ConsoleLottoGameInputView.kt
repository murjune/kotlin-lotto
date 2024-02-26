package view

class ConsoleLottoGameInputView : LottoGameInputView {
    override fun inputPurchaseExpense(): Int {
        println(MESSAGE_INPUT_PURCHASE_EXPENSE)
        return readln().toIntOrNull() ?: throw IllegalArgumentException(EXCEPTION_PURCHASE_EXPENSE)
    }

    override fun inputManualLottoCount(): Int {
        println(MESSAGE_INPUT_MANUAL_LOTTO_COUNT)
        return readln().toIntOrNull() ?: throw IllegalArgumentException(EXCEPTION_PURCHASE_EXPENSE)
    }

    override fun inputManualLottoNumbers(size: Int): List<List<Int>> {
        println(MESSAGE_INPUT_MANUAL_LOTTO_NUMBERS)
        return List(size) {
            readln().split(DELIMITER).map {
                it.trim().toIntOrNull() ?: throw IllegalArgumentException(EXCEPTION_WINNING_NUMBER)
            }
        }
    }

    override fun inputWinningNumbers(): List<Int> {
        println(MESSAGE_INPUT_WINNING_NUMBERS)
        val winningNumbers =
            readln().split(DELIMITER).map {
                it.trim().toIntOrNull() ?: throw IllegalArgumentException(EXCEPTION_WINNING_NUMBER)
            }
        return winningNumbers
    }

    override fun inputBonusNumber(): Int {
        println(MESSAGE_INPUT_BONUS_NUMBER)
        return readln().toIntOrNull() ?: throw IllegalArgumentException(EXCEPTION_BONUS_NUMBER)
    }

    companion object {
        private const val MESSAGE_INPUT_PURCHASE_EXPENSE = "구입금액을 입력해 주세요."
        private const val MESSAGE_INPUT_MANUAL_LOTTO_COUNT = "수동으로 구매할 로또 수를 입력해 주세요."
        private const val MESSAGE_INPUT_MANUAL_LOTTO_NUMBERS = "수동으로 구매할 로또 번호를 입력해 주세요."
        private const val MESSAGE_INPUT_WINNING_NUMBERS = "지난 주 당첨 번호를 입력해 주세요."
        private const val MESSAGE_INPUT_BONUS_NUMBER = "보너스 볼을 입력해 주세요."
        private const val DELIMITER = ","
        private const val EXCEPTION_PURCHASE_EXPENSE = "로또 구매 금액은 정수여야 합니다."
        private const val EXCEPTION_WINNING_NUMBER = "당첨 번호는 정수여야 합니다."
        private const val EXCEPTION_BONUS_NUMBER = "보너스 번호는 정수여야 합니다."
    }
}
