package br.com.argmax.imagelabeling.di

import br.com.argmax.imagelabeling.application.modules.domaindetail.DomainDetailFragment
import br.com.argmax.imagelabeling.application.modules.selectdomain.SelectDomainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector(
        modules = [SelectDomainViewModelsModule::class]
    )
    abstract fun contributesSelectDomainFragment(): SelectDomainFragment

    @ContributesAndroidInjector(
        modules = [DomainDetailViewModelsModule::class]
    )
    abstract fun contributesDomainDetailFragment(): DomainDetailFragment

}