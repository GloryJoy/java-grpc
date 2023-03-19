// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blog/blog.proto

package com.joyful.java.grpc.blog;

/**
 * Protobuf service {@code blog.BlogService}
 */
public  abstract class BlogService
    implements com.google.protobuf.Service {
  protected BlogService() {}

  public interface Interface {
    /**
     * <code>rpc CreateBlog(.blog.CreateBlogRequest) returns (.blog.CreateBlogResponse);</code>
     */
    public abstract void createBlog(
        com.google.protobuf.RpcController controller,
        com.joyful.java.grpc.blog.CreateBlogRequest request,
        com.google.protobuf.RpcCallback<com.joyful.java.grpc.blog.CreateBlogResponse> done);

    /**
     * <code>rpc ReadBlog(.blog.ReadBlogRequest) returns (.blog.ReadBlogResponse);</code>
     */
    public abstract void readBlog(
        com.google.protobuf.RpcController controller,
        com.joyful.java.grpc.blog.ReadBlogRequest request,
        com.google.protobuf.RpcCallback<com.joyful.java.grpc.blog.ReadBlogResponse> done);

    /**
     * <code>rpc UpdateBlog(.blog.UpdateBlogRequest) returns (.blog.UpdateBlogResponse);</code>
     */
    public abstract void updateBlog(
        com.google.protobuf.RpcController controller,
        com.joyful.java.grpc.blog.UpdateBlogRequest request,
        com.google.protobuf.RpcCallback<com.joyful.java.grpc.blog.UpdateBlogResponse> done);

    /**
     * <code>rpc DeleteBlog(.blog.DeleteBlogRequest) returns (.blog.DeleteBlogResponse);</code>
     */
    public abstract void deleteBlog(
        com.google.protobuf.RpcController controller,
        com.joyful.java.grpc.blog.DeleteBlogRequest request,
        com.google.protobuf.RpcCallback<com.joyful.java.grpc.blog.DeleteBlogResponse> done);

    /**
     * <code>rpc ListBlog(.blog.ListBlogRequest) returns (stream .blog.ListBlogResponse);</code>
     */
    public abstract void listBlog(
        com.google.protobuf.RpcController controller,
        com.joyful.java.grpc.blog.ListBlogRequest request,
        com.google.protobuf.RpcCallback<com.joyful.java.grpc.blog.ListBlogResponse> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new BlogService() {
      @java.lang.Override
      public  void createBlog(
          com.google.protobuf.RpcController controller,
          com.joyful.java.grpc.blog.CreateBlogRequest request,
          com.google.protobuf.RpcCallback<com.joyful.java.grpc.blog.CreateBlogResponse> done) {
        impl.createBlog(controller, request, done);
      }

      @java.lang.Override
      public  void readBlog(
          com.google.protobuf.RpcController controller,
          com.joyful.java.grpc.blog.ReadBlogRequest request,
          com.google.protobuf.RpcCallback<com.joyful.java.grpc.blog.ReadBlogResponse> done) {
        impl.readBlog(controller, request, done);
      }

      @java.lang.Override
      public  void updateBlog(
          com.google.protobuf.RpcController controller,
          com.joyful.java.grpc.blog.UpdateBlogRequest request,
          com.google.protobuf.RpcCallback<com.joyful.java.grpc.blog.UpdateBlogResponse> done) {
        impl.updateBlog(controller, request, done);
      }

      @java.lang.Override
      public  void deleteBlog(
          com.google.protobuf.RpcController controller,
          com.joyful.java.grpc.blog.DeleteBlogRequest request,
          com.google.protobuf.RpcCallback<com.joyful.java.grpc.blog.DeleteBlogResponse> done) {
        impl.deleteBlog(controller, request, done);
      }

      @java.lang.Override
      public  void listBlog(
          com.google.protobuf.RpcController controller,
          com.joyful.java.grpc.blog.ListBlogRequest request,
          com.google.protobuf.RpcCallback<com.joyful.java.grpc.blog.ListBlogResponse> done) {
        impl.listBlog(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.createBlog(controller, (com.joyful.java.grpc.blog.CreateBlogRequest)request);
          case 1:
            return impl.readBlog(controller, (com.joyful.java.grpc.blog.ReadBlogRequest)request);
          case 2:
            return impl.updateBlog(controller, (com.joyful.java.grpc.blog.UpdateBlogRequest)request);
          case 3:
            return impl.deleteBlog(controller, (com.joyful.java.grpc.blog.DeleteBlogRequest)request);
          case 4:
            return impl.listBlog(controller, (com.joyful.java.grpc.blog.ListBlogRequest)request);
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.joyful.java.grpc.blog.CreateBlogRequest.getDefaultInstance();
          case 1:
            return com.joyful.java.grpc.blog.ReadBlogRequest.getDefaultInstance();
          case 2:
            return com.joyful.java.grpc.blog.UpdateBlogRequest.getDefaultInstance();
          case 3:
            return com.joyful.java.grpc.blog.DeleteBlogRequest.getDefaultInstance();
          case 4:
            return com.joyful.java.grpc.blog.ListBlogRequest.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.joyful.java.grpc.blog.CreateBlogResponse.getDefaultInstance();
          case 1:
            return com.joyful.java.grpc.blog.ReadBlogResponse.getDefaultInstance();
          case 2:
            return com.joyful.java.grpc.blog.UpdateBlogResponse.getDefaultInstance();
          case 3:
            return com.joyful.java.grpc.blog.DeleteBlogResponse.getDefaultInstance();
          case 4:
            return com.joyful.java.grpc.blog.ListBlogResponse.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <code>rpc CreateBlog(.blog.CreateBlogRequest) returns (.blog.CreateBlogResponse);</code>
   */
  public abstract void createBlog(
      com.google.protobuf.RpcController controller,
      com.joyful.java.grpc.blog.CreateBlogRequest request,
      com.google.protobuf.RpcCallback<com.joyful.java.grpc.blog.CreateBlogResponse> done);

  /**
   * <code>rpc ReadBlog(.blog.ReadBlogRequest) returns (.blog.ReadBlogResponse);</code>
   */
  public abstract void readBlog(
      com.google.protobuf.RpcController controller,
      com.joyful.java.grpc.blog.ReadBlogRequest request,
      com.google.protobuf.RpcCallback<com.joyful.java.grpc.blog.ReadBlogResponse> done);

  /**
   * <code>rpc UpdateBlog(.blog.UpdateBlogRequest) returns (.blog.UpdateBlogResponse);</code>
   */
  public abstract void updateBlog(
      com.google.protobuf.RpcController controller,
      com.joyful.java.grpc.blog.UpdateBlogRequest request,
      com.google.protobuf.RpcCallback<com.joyful.java.grpc.blog.UpdateBlogResponse> done);

  /**
   * <code>rpc DeleteBlog(.blog.DeleteBlogRequest) returns (.blog.DeleteBlogResponse);</code>
   */
  public abstract void deleteBlog(
      com.google.protobuf.RpcController controller,
      com.joyful.java.grpc.blog.DeleteBlogRequest request,
      com.google.protobuf.RpcCallback<com.joyful.java.grpc.blog.DeleteBlogResponse> done);

  /**
   * <code>rpc ListBlog(.blog.ListBlogRequest) returns (stream .blog.ListBlogResponse);</code>
   */
  public abstract void listBlog(
      com.google.protobuf.RpcController controller,
      com.joyful.java.grpc.blog.ListBlogRequest request,
      com.google.protobuf.RpcCallback<com.joyful.java.grpc.blog.ListBlogResponse> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return com.joyful.java.grpc.blog.BlogOuterClass.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.createBlog(controller, (com.joyful.java.grpc.blog.CreateBlogRequest)request,
          com.google.protobuf.RpcUtil.<com.joyful.java.grpc.blog.CreateBlogResponse>specializeCallback(
            done));
        return;
      case 1:
        this.readBlog(controller, (com.joyful.java.grpc.blog.ReadBlogRequest)request,
          com.google.protobuf.RpcUtil.<com.joyful.java.grpc.blog.ReadBlogResponse>specializeCallback(
            done));
        return;
      case 2:
        this.updateBlog(controller, (com.joyful.java.grpc.blog.UpdateBlogRequest)request,
          com.google.protobuf.RpcUtil.<com.joyful.java.grpc.blog.UpdateBlogResponse>specializeCallback(
            done));
        return;
      case 3:
        this.deleteBlog(controller, (com.joyful.java.grpc.blog.DeleteBlogRequest)request,
          com.google.protobuf.RpcUtil.<com.joyful.java.grpc.blog.DeleteBlogResponse>specializeCallback(
            done));
        return;
      case 4:
        this.listBlog(controller, (com.joyful.java.grpc.blog.ListBlogRequest)request,
          com.google.protobuf.RpcUtil.<com.joyful.java.grpc.blog.ListBlogResponse>specializeCallback(
            done));
        return;
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.joyful.java.grpc.blog.CreateBlogRequest.getDefaultInstance();
      case 1:
        return com.joyful.java.grpc.blog.ReadBlogRequest.getDefaultInstance();
      case 2:
        return com.joyful.java.grpc.blog.UpdateBlogRequest.getDefaultInstance();
      case 3:
        return com.joyful.java.grpc.blog.DeleteBlogRequest.getDefaultInstance();
      case 4:
        return com.joyful.java.grpc.blog.ListBlogRequest.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.joyful.java.grpc.blog.CreateBlogResponse.getDefaultInstance();
      case 1:
        return com.joyful.java.grpc.blog.ReadBlogResponse.getDefaultInstance();
      case 2:
        return com.joyful.java.grpc.blog.UpdateBlogResponse.getDefaultInstance();
      case 3:
        return com.joyful.java.grpc.blog.DeleteBlogResponse.getDefaultInstance();
      case 4:
        return com.joyful.java.grpc.blog.ListBlogResponse.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends com.joyful.java.grpc.blog.BlogService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void createBlog(
        com.google.protobuf.RpcController controller,
        com.joyful.java.grpc.blog.CreateBlogRequest request,
        com.google.protobuf.RpcCallback<com.joyful.java.grpc.blog.CreateBlogResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.joyful.java.grpc.blog.CreateBlogResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.joyful.java.grpc.blog.CreateBlogResponse.class,
          com.joyful.java.grpc.blog.CreateBlogResponse.getDefaultInstance()));
    }

    public  void readBlog(
        com.google.protobuf.RpcController controller,
        com.joyful.java.grpc.blog.ReadBlogRequest request,
        com.google.protobuf.RpcCallback<com.joyful.java.grpc.blog.ReadBlogResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        com.joyful.java.grpc.blog.ReadBlogResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.joyful.java.grpc.blog.ReadBlogResponse.class,
          com.joyful.java.grpc.blog.ReadBlogResponse.getDefaultInstance()));
    }

    public  void updateBlog(
        com.google.protobuf.RpcController controller,
        com.joyful.java.grpc.blog.UpdateBlogRequest request,
        com.google.protobuf.RpcCallback<com.joyful.java.grpc.blog.UpdateBlogResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        com.joyful.java.grpc.blog.UpdateBlogResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.joyful.java.grpc.blog.UpdateBlogResponse.class,
          com.joyful.java.grpc.blog.UpdateBlogResponse.getDefaultInstance()));
    }

    public  void deleteBlog(
        com.google.protobuf.RpcController controller,
        com.joyful.java.grpc.blog.DeleteBlogRequest request,
        com.google.protobuf.RpcCallback<com.joyful.java.grpc.blog.DeleteBlogResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(3),
        controller,
        request,
        com.joyful.java.grpc.blog.DeleteBlogResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.joyful.java.grpc.blog.DeleteBlogResponse.class,
          com.joyful.java.grpc.blog.DeleteBlogResponse.getDefaultInstance()));
    }

    public  void listBlog(
        com.google.protobuf.RpcController controller,
        com.joyful.java.grpc.blog.ListBlogRequest request,
        com.google.protobuf.RpcCallback<com.joyful.java.grpc.blog.ListBlogResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(4),
        controller,
        request,
        com.joyful.java.grpc.blog.ListBlogResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.joyful.java.grpc.blog.ListBlogResponse.class,
          com.joyful.java.grpc.blog.ListBlogResponse.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public com.joyful.java.grpc.blog.CreateBlogResponse createBlog(
        com.google.protobuf.RpcController controller,
        com.joyful.java.grpc.blog.CreateBlogRequest request)
        throws com.google.protobuf.ServiceException;

    public com.joyful.java.grpc.blog.ReadBlogResponse readBlog(
        com.google.protobuf.RpcController controller,
        com.joyful.java.grpc.blog.ReadBlogRequest request)
        throws com.google.protobuf.ServiceException;

    public com.joyful.java.grpc.blog.UpdateBlogResponse updateBlog(
        com.google.protobuf.RpcController controller,
        com.joyful.java.grpc.blog.UpdateBlogRequest request)
        throws com.google.protobuf.ServiceException;

    public com.joyful.java.grpc.blog.DeleteBlogResponse deleteBlog(
        com.google.protobuf.RpcController controller,
        com.joyful.java.grpc.blog.DeleteBlogRequest request)
        throws com.google.protobuf.ServiceException;

    public com.joyful.java.grpc.blog.ListBlogResponse listBlog(
        com.google.protobuf.RpcController controller,
        com.joyful.java.grpc.blog.ListBlogRequest request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public com.joyful.java.grpc.blog.CreateBlogResponse createBlog(
        com.google.protobuf.RpcController controller,
        com.joyful.java.grpc.blog.CreateBlogRequest request)
        throws com.google.protobuf.ServiceException {
      return (com.joyful.java.grpc.blog.CreateBlogResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.joyful.java.grpc.blog.CreateBlogResponse.getDefaultInstance());
    }


    public com.joyful.java.grpc.blog.ReadBlogResponse readBlog(
        com.google.protobuf.RpcController controller,
        com.joyful.java.grpc.blog.ReadBlogRequest request)
        throws com.google.protobuf.ServiceException {
      return (com.joyful.java.grpc.blog.ReadBlogResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        com.joyful.java.grpc.blog.ReadBlogResponse.getDefaultInstance());
    }


    public com.joyful.java.grpc.blog.UpdateBlogResponse updateBlog(
        com.google.protobuf.RpcController controller,
        com.joyful.java.grpc.blog.UpdateBlogRequest request)
        throws com.google.protobuf.ServiceException {
      return (com.joyful.java.grpc.blog.UpdateBlogResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        com.joyful.java.grpc.blog.UpdateBlogResponse.getDefaultInstance());
    }


    public com.joyful.java.grpc.blog.DeleteBlogResponse deleteBlog(
        com.google.protobuf.RpcController controller,
        com.joyful.java.grpc.blog.DeleteBlogRequest request)
        throws com.google.protobuf.ServiceException {
      return (com.joyful.java.grpc.blog.DeleteBlogResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(3),
        controller,
        request,
        com.joyful.java.grpc.blog.DeleteBlogResponse.getDefaultInstance());
    }


    public com.joyful.java.grpc.blog.ListBlogResponse listBlog(
        com.google.protobuf.RpcController controller,
        com.joyful.java.grpc.blog.ListBlogRequest request)
        throws com.google.protobuf.ServiceException {
      return (com.joyful.java.grpc.blog.ListBlogResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(4),
        controller,
        request,
        com.joyful.java.grpc.blog.ListBlogResponse.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:blog.BlogService)
}
