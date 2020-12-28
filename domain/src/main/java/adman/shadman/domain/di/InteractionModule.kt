package adman.shadman.domain.interaction

import adman.shadman.domain.repository.CardsRepository
import org.koin.dsl.module

/**
 * We inject the dependencies from use cases to
 * use cases implementation.
 */
val interactionModule= module {
    factory<CardsUseCase> { CardsUseCaseImpl(get()) }
}