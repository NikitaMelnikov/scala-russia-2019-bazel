load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")

java_library(
    name = "lenses_2_12",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//external:jar/com/thesamet/scalapb/lenses_2_12"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "scalapb_runtime",
    exports = [
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/com/lihaoyi:fastparse_2_12",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":lenses_2_12"
    ],
    jars = [
        "//external:jar/com/thesamet/scalapb/scalapb_runtime_2_12"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "scalapb_runtime_grpc",
    exports = [
        "//3rdparty/jvm/io/grpc:grpc_protobuf",
        "//3rdparty/jvm/io/grpc:grpc_stub",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":scalapb_runtime"
    ],
    jars = [
        "//external:jar/com/thesamet/scalapb/scalapb_runtime_grpc_2_12"
    ],
    visibility = [
        "//visibility:public"
    ]
)


