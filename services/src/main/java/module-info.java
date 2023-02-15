import io.github.creek.bot.connect.service.demo.services.HandleOccurrenceServiceDescriptor;
import org.creekservice.api.platform.metadata.ComponentDescriptor;

module connect.service.demo.services {
    requires transitive connect.service.demo.api;

    exports io.github.creek.bot.connect.service.demo.services;

    provides ComponentDescriptor with
            HandleOccurrenceServiceDescriptor;
}
