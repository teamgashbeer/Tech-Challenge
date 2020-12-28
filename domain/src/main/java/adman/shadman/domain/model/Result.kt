package adman.shadman.domain.model

/**
 * This class if for getting the result
 * from network.
 */
sealed class Result <out T:Any>

/**
 * We use this data class for getting success [Result]
 */
data class Success<out T:Any>(val data:T) : Result<T>()

/**
 * We use this data class for getting failure [Result]
 */
data class Failure(val httpError: HttpError) : Result<Nothing>()

/**
 * A class for getting http error with their code
 */
class HttpError(val throwable: Throwable,val errorCode:Int=0)

inline fun <T:Any> Result<T>.onSuccess(action:(T)->Unit):Result
<T>{
    if (this is Success) action(data)
    return this
}

inline fun <T:Any> Result<T>.onFailure(action: (HttpError) -> Unit){
    if (this is Failure) action(httpError)
}