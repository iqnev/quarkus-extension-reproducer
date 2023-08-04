package demo.deployment;

import demo.runtime.DemoManager;
import demo.runtime.DemoProvider;
import demo.runtime.beanconfig.DemoProviderConfig;
import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

public class DemoExtensionProcessor {

  private static final String FEATURE = "demo-extension";

  @BuildStep
  FeatureBuildItem feature() {
    return new FeatureBuildItem(FEATURE);
  }

  @BuildStep
  AdditionalBeanBuildItem registerAdditionalBeans() {
    return AdditionalBeanBuildItem.builder()
        .addBeanClasses(DemoProviderConfig.class, DemoManager.class, DemoProvider.class)
        .setUnremovable()
        .build();
  }
}
