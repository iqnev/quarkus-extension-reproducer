package demo.runtime;

import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@ApplicationScoped
@RequiredArgsConstructor
@Slf4j
public class DemoManager {

  final DemoProvider demoProvider;

  void onStart(@Observes StartupEvent ev) {
    log.info("The demo application is starting...");

    demoProvider.printMode();
  }
}
