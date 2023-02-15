module connect.service.demo.api {
    requires transitive creek.kafka.metadata;

    exports io.github.creek.bot.connect.service.demo.api;
    exports io.github.creek.bot.connect.service.demo.internal to
            connect.service.demo.services,
            connect.service.demo.service;
}
