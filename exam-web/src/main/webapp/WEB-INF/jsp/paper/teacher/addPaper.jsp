<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增试卷</title>
</head>
<body>
<div class="container clearfix">
    <div class="wrapper">
        <div class="col-lg-9">
            <section class="panel">
                <header class="panel-heading bg-success">
                    <ul class="nav nav-tabs">
                        <li class="active">
                            <a href="#profile" data-toggle="tab">
                                <h6>试卷基本信息</h6>
                            </a>
                        </li>
                    </ul>
                </header>
                <div class="panel-body">
                    <div class="tab-content">
                        <div id="profile" class="tab-pane active">
                            <form style="width:300px" action="<%=request.getContextPath()%>/teacher/add" method="post" target="_self">
                                <div class="form-group">
                                    <label class="control-label" for="id_pname">试卷名</label>
                                    <input id="id_pname" class="form-control" autocomplete="off" type="text"
                                           placeholder="Enter exampaper's name" name="pname">
                                </div>
                                <div class="form-group">
                                    <label class="control-label" autocomplete="off" for="id_tag">试卷简介</label>
                                    <input id="id_tag" class="form-control" type="text" maxlength="16"
                                           placeholder="Enter introduction of exampaper" name="tag">
                                </div>
                                <div class="form-group">
                                    <label class="control-label" autocomplete="off" for="id_time">考试时间</label>
                                    <input id="id_time" class="form-control" type="text" placeholder="minutes"
                                           name="time">
                                </div>
                                <div class="form-group">
                                    <label class="control-label" autocomplete="off" for="id_maxquestion">题量</label>
                                    <input id="id_maxquestion" class="form-control" type="number" step="5" name="maxQuestion">
                                </div>
                                <input type="submit" class="btn btn-block btn-success" value="添加试题" />
                            </form>
                        </div>
                        </form>
                    </div>
                </div>
            </section>
        </div>
    </div>
</div>
</body>
</html>
