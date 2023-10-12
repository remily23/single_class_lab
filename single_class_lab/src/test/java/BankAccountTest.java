import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount("Eoan", "Odea", "4-10-1983", 00126);
    }

    @Test
    public void canDepositFunds(){
        bankAccount.deposit(10);
        assertThat(bankAccount.getBalance()).isEqualTo(10);
    }

    @Test
    public void canWithdrawFunds(){
        bankAccount.deposit(10);
        bankAccount.withdraw(5);
        assertThat(bankAccount.getBalance()).isEqualTo(5);
    }

    @Test
    public void canPayInterest(){
        bankAccount.deposit(100);
        bankAccount.payInterest();
        assertThat(bankAccount.getBalance()).isEqualTo(105);
    }

    //            Tests for getters and setters
    @Test
    public void hasFirstName(){
        assertThat(bankAccount.getFirstName()).isEqualTo("Eoan");
    }

    @Test
    public void canSetFirstName(){
        bankAccount.setFirstName("Daniel");
        assertThat(bankAccount.getFirstName()).isEqualTo("Daniel");
    }

    @Test
    public void hasLastName(){
        assertThat(bankAccount.getLastName()).isEqualTo("Odea");
    }

    @Test
    public void canSetLastName(){
        bankAccount.setLastName("DeVito");
        assertThat(bankAccount.getLastName()).isEqualTo("DeVito");
    }

    @Test
    public void hasDateOfBirth(){
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("4-10-1983");
    }

    @Test
    public void canSetDateOfBirth(){
        bankAccount.setDateOfBirth("5-9-1995");
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("5-9-1995");
    }

    @Test
    public void hasAccountNumber(){
        assertThat(bankAccount.getAccountNumber()).isEqualTo(00126);
    }

    @Test
    public void canSetAccountNumber(){
        bankAccount.setAccountNumber(00127);
        assertThat(bankAccount.getAccountNumber()).isEqualTo(00127);
    }

    @Test
    public void canGetBalance(){
        assertThat(bankAccount.getBalance()).isEqualTo(0);
    }

    @Test
    public void canSetBalance(){
        bankAccount.setBalance(100);
        assertThat(bankAccount.getBalance()).isEqualTo(100);
    }

}