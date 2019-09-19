load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")

package(default_visibility = ["//visibility:public"])

scala_library(
    name = 'config',
    deps = [
        '//3rdparty/jvm/com/typesafe:config',
    ],
    exports = [
        '//3rdparty/jvm/com/typesafe:config',
    ]
)

scala_library(
    name = 'logging',
    deps = [
        '//3rdparty/jvm/ch/qos/logback:logback_classic',
        '//3rdparty/jvm/org/slf4j:slf4j_api',
        '//3rdparty/jvm/com/typesafe/scala_logging:scala_logging',
    ],
    exports = [
        '//3rdparty/jvm/ch/qos/logback:logback_classic',
        '//3rdparty/jvm/org/slf4j:slf4j_api',
        '//3rdparty/jvm/com/typesafe/scala_logging:scala_logging',
    ],
)

scala_library(
    name = 'test',
    deps = [
        '//3rdparty/jvm/org/scalatest:scalatest',
        '//3rdparty/jvm/org/mockito:mockito_core',
    ],
    exports = [
        '//3rdparty/jvm/org/scalatest:scalatest',
        '//3rdparty/jvm/org/mockito:mockito_core',
    ]
)

scala_library(
    name = 'grpc',
    deps = [
        '//3rdparty/jvm/io/grpc:grpc_core',
        '//3rdparty/jvm/io/grpc:grpc_protobuf',
        '//3rdparty/jvm/io/grpc:grpc_stub',
        '//3rdparty/jvm/io/grpc:grpc_testing',
        '//3rdparty/jvm/io/grpc:grpc_netty_shaded',
        '//3rdparty/jvm/com/thesamet/scalapb:scalapb_runtime',
        '//3rdparty/jvm/com/thesamet/scalapb:scalapb_runtime_grpc',
    ],
    exports = [
        '//3rdparty/jvm/io/grpc:grpc_core',
        '//3rdparty/jvm/io/grpc:grpc_protobuf',
        '//3rdparty/jvm/io/grpc:grpc_stub',
        '//3rdparty/jvm/io/grpc:grpc_testing',
        '//3rdparty/jvm/io/grpc:grpc_netty_shaded',
        '//3rdparty/jvm/com/thesamet/scalapb:scalapb_runtime',
        '//3rdparty/jvm/com/thesamet/scalapb:scalapb_runtime_grpc',
    ]
)