// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blog/blog.proto

package com.joyful.java.grpc.blog;

public interface DeleteBlogResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:blog.DeleteBlogResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 delete_count = 1;</code>
   * @return The deleteCount.
   */
  int getDeleteCount();

  /**
   * <code>bool acknowledged_deletion = 2;</code>
   * @return The acknowledgedDeletion.
   */
  boolean getAcknowledgedDeletion();
}