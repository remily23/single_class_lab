public class BankAccountTest {

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

    public class BankAccountTest {
        private BankAccount bankAccount; // to link to BankAccount attributes/properties

        // Deposit Test
        @Test
        void canDeposit(){

// Given
            deposit deposit = new deposit();
            double startingBalance = bankAccount.getBalance();
            double depositAmount = 100;

// When
            bankAccount.deposit(depositAmount);

// Then
            double updatedBalance = startingBalance + depositAmount;
            assertThat(updatedBalance).isEqualTo(depositAmount);
        }

        // Withdrawal Test
        @Test
        void canWithdraw(){
        }

// Given
    bankAccount.deposit(100); // starting balance of £100
        double startingBalance = bankAccount.getBalance();
        double withDrawalAmount = 20;

// When
        bankAccount.withdrawal;(withdrawalAmount);

        // Then
        double updatedBalance = initialBalance - withDrawalAmount;
        assertThat(updatedBalance, bankAccount.getBalance());


    }

}

}

