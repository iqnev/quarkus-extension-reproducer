package demo.runtime.beanconfig;

import demo.runtime.DemoProvider;
import demo.runtime.impl.DemoCustomProvider;
import demo.runtime.impl.DemoProviderImpl;
import io.quarkus.arc.DefaultBean;
import io.quarkus.arc.profile.IfBuildProfile;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import lombok.RequiredArgsConstructor;

@ApplicationScoped
@RequiredArgsConstructor
public class DemoProviderConfig {

  @Produces
  @IfBuildProfile(anyOf = {"prod", "dev"})
  public DemoProvider mainProvider() {
    return new DemoProviderImpl();
  }

  @Produces
  @DefaultBean
  public DemoProvider customDemoProvider() {
    return new DemoCustomProvider();
  }
}
