load("@io_bazel_rules_scala//scala:scala_toolchain.bzl", "scala_toolchain")
load("@io_bazel_rules_scala//scala_proto:scala_proto_toolchain.bzl", "scala_proto_toolchain")

scala_toolchain(
    name = "scala_toolchain_impl",
    scalacopts = [
        "-encoding", "utf8",
        "-feature",
        "-unchecked",
        "-deprecation",
        "-target:jvm-1.8",
        "-Ypartial-unification",
        "-language:experimental.macros",
        "-language:_"
    ],
    unused_dependency_checker_mode = "off",
    visibility = ["//visibility:public"],
)

toolchain(
    name = "scala_toolchain",
    toolchain_type = "@io_bazel_rules_scala//scala:toolchain_type",
    toolchain = "scala_toolchain_impl",
    visibility = ["//visibility:public"]
)


scala_proto_toolchain(
    name = "scala_proto_toolchain_configuration",
    with_grpc = True,
    with_flat_package = False,
    with_single_line_to_string = False,
    visibility = ["//visibility:public"],
)

toolchain(
    name = "scalapb_toolchain",
    toolchain = ":scala_proto_toolchain_configuration",
    toolchain_type = "@io_bazel_rules_scala//scala_proto:toolchain_type",
    visibility = ["//visibility:public"],
)