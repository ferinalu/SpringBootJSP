<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

    <c:import url="/WEB-INF/jsp/tags/header.jsp"/>

    <body>

        <nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0">
            <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">Company name</a>
            <input class="form-control form-control-dark w-100" type="text" placeholder="Search" aria-label="Search">
            <ul class="navbar-nav px-3">
                <li class="nav-item text-nowrap">
                    <a class="nav-link" href="#">Sign out</a>
                </li>
            </ul>
        </nav>

        <div class="container-fluid">
            <div class="row">
                <nav class="col-md-2 d-none d-md-block bg-light sidebar">
                    <div class="sidebar-sticky">
                        <ul class="nav flex-column">
                            <li class="nav-item">
                                <a class="nav-link active" href="index">
                                    <span data-feather="home"></span> Dashboard 
                                    <span class="sr-only">(current)</span>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="countrie"><span data-feather="file"></span> Country</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="department"><span data-feather="shopping-cart"></span> Department</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="employee"><span data-feather="users"></span> Employee</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="job"><span data-feather="bar-chart-2"></span> Job</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="location"><span data-feather="layers"></span> Location</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="region"><span data-feather="layers"></span> Region</a>
                            </li>
                        </ul>

                        <h6 class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted">
                            <span>Saved reports</span>
                            <a class="d-flex align-items-center text-muted" href="#">
                                <span data-feather="plus-circle"></span>
                            </a>
                        </h6>
                        <ul class="nav flex-column mb-2">
                            <li class="nav-item">
                                <a class="nav-link" href="#"><span data-feather="file-text"></span> Current month</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#"><span data-feather="file-text"></span> Last quarter</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#"><span data-feather="file-text"></span> Social engagement</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#"><span data-feather="file-text"></span> Year-end sale </a>
                            </li>
                        </ul>
                    </div>
                </nav>

                <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
                    <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
                        <h1 class="h2">Dashboard</h1>
                        <div class="btn-toolbar mb-2 mb-md-0">
                            <div class="btn-group mr-2">
                                <button class="btn btn-sm btn-outline-secondary">Share</button>
                                <button class="btn btn-sm btn-outline-secondary">Export</button>
                            </div>
                            <button class="btn btn-sm btn-outline-secondary dropdown-toggle">
                                <span data-feather="calendar"></span>
                                This week
                            </button>
                        </div>
                    </div>
                    <a href="${pageContext.request.contextPath}/personList">Person</a>
                    <a href="${pageContext.request.contextPath}/region">Region</a>
                    <!--<canvas class="my-4" id="myChart" width="900" height="380"></canvas>-->
                </main>
            </div>
        </div>
    </body>

    <c:import url="/WEB-INF/jsp/tags/footer.jsp"/>

</html>