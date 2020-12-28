package adman.shadman.domain.base
import adman.shadman.domain.model.Result

/**
 * We use this interface as a base for all use case that we need.
 * We use a suspend function for all result that we get for each
 * use case. (for example each request is a use case)
 */
interface BaseUseCase<T :Any,R:Any> {
    suspend operator fun invoke(params:Map<String,T>):Result<R>
}