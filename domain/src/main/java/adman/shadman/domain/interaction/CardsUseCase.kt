package adman.shadman.domain.interaction

import adman.shadman.domain.base.BaseUseCase
import adman.shadman.domain.model.CardsModel
import adman.shadman.domain.model.Result

interface CardsUseCase:BaseUseCase<String,CardsModel> {
    override suspend fun invoke(params: Map<String, String>): Result<CardsModel>
}