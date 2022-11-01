package listenersLesson13;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

//flakyTest это значит что тесты работают достаточно неустойчиво.
// что это значит неустойчиво?
//иногда тест падает. но это не значит что
//у нас есть bug просто по ряду причин он
//иногда падает.
//что в таких случаях делать. в таких случаях нам надо перезапустить этот тест.
                                                    //4)
public class MyRetry implements IRetryAnalyzer {

    private int retryCount = 0;
    private static final int maxRetryCount = 3; //здесь я ставлю сколько попыток я хочу повторить

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}
//я сказал смотрите retryAnalyzer, говорю maxRetryCount 3.
// то есть я говорю попробуем максимально 3 раза если  он все
//3 раза упал значит это bug, но если вам хоть один раз из 3 не упал
//значит все нормально вы должны знать что существует такая возможность retry и делать просто
//в реальной жизни такие проблемы случаются.