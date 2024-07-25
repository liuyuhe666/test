# 获取一张二次元图片
Write-Output "---- Fetch Image ----"
# 当前时间
$t = Get-Date -Format "yyyy_MM_dd_HH_mm_ss"
# 二次元图片 API
$uri = "https://t.alcy.cc/pc/"
# 文件名
$filename = $t + ".webp"
Write-Output "filename: $filename"
# 下载
Invoke-WebRequest -Uri $uri -Outfile $filename
# 压缩图片（质量q=5）
$input = $filename
$output = $t + "_compressed.webp"
ffmpeg -i $input -q 5 $output
# 删除原图片
Remove-Item $filename
Write-Output "---- Fetch Image ----"