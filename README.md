# rockchip-yocto-linux

## Quick Start
### I. Configure yocto/oe Environment
```shell
~/Rockchip-RK3568-Yocto $ source poky/oe-init-build-env
```
#### II. Building yocto project
```shell
~/Rockchip-RK3568-Yocto $ bitbake core-image-weston
```
At the end of a successful build, you should have an .wic image in `/path/to/yocto/build/tmp/deploy/images/<MACHINE>/`, also with an rockchip firmware image: `update.img`.

