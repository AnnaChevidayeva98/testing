using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using TriangleApp;

namespace TriangleTests
{
    [TestClass]
    public class TriangleTest
    {
        [TestMethod]
        public void IsRightTriangle()
        {
            Assert.IsTrue(Triangle.IsTriangle(2, 3, 4));
        }

        [TestMethod]
        public void IsTrianglePossible()
        {
            Assert.IsFalse(Triangle.IsTriangle(15, 6, 1));
        }

        [TestMethod]
        public void IsTriangle_ReturnsTrue()
        {
            Assert.IsFalse(Triangle.IsTriangle(3, 1, 5));
        }

        [TestMethod]
        public void IsTriangleEquilateralTriangle()
        {
            Assert.IsTrue(Triangle.IsTriangle(5, 5, 5));
        }

        [TestMethod]
        public void IsTrianglePossible_SumMoreThanSideLength()
        {
            Assert.IsTrue(Triangle.IsTriangle(3, 2, 5));
        }

        [TestMethod]
        public void OneSideIsNegative()
        {
            Assert.IsFalse(Triangle.IsTriangle(-3, 1, 5));
        }

        [TestMethod]
        public void OneSideIsZero()
        {
            Assert.IsFalse(Triangle.IsTriangle(0, 1, 5));
        }

        [TestMethod]
        public void AllSidesIsNegative()
        {
            Assert.IsFalse(Triangle.IsTriangle(-1, -1, -5));
        }

        [TestMethod]
        public void IsTriangleIsoscelesTriangle()
        {
            Assert.IsTrue(Triangle.IsTriangle(2, 2, 4));
        }

        [TestMethod]
        public void AllSidesIsZero()
        {
            Assert.IsFalse(Triangle.IsTriangle(0, 0, 5));
        }
    }
}
