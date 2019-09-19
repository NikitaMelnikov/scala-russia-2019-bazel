load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test", "scala_test_suite")
load("@io_bazel_rules_scala//scala_proto:scala_proto.bzl", "scalapb_proto_library")

scala_library(
    name = 'app',
    srcs = glob([
        'app/src/main/scala/**'
    ]),
    deps = [
        ':demo_grpc',
        '//dependencies:config',
        '//dependencies:logging',
        '//dependencies:grpc',
    ],
    exports = [
        '//dependencies:config',
        '//dependencies:logging',
    ],
    resources = glob([
        'app/src/main/resources/**'
    ]),
)

scala_binary(
    name = 'app_binary',
    main_class = 'demo.DemoAppStarter',
    deps = [
        ':app'
    ]
)

scala_test(
    name = 'tests',
    srcs = glob([
        'app/src/test/scala/**',
    ]),
    resources = glob([
        'app/src/test/resources/**',
    ]),
    deps = [
        ':app',
        '//dependencies:test',
    ]
)

scalapb_proto_library(
    name = 'demo_grpc',
    deps = [
        ':demo_proto'
    ]
)

proto_library(
    name = "demo_proto",
    srcs = [
        'app/grpc/DemoService.proto'
    ],
)